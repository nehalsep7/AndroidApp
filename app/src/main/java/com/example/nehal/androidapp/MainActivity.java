package com.example.nehal.androidapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.nehal.androidapp.RetrofitModels.Product;
import com.example.nehal.androidapp.RetrofitModels.ResponseModel;
import com.example.nehal.androidapp.RetrofitModels.User;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<Product> products = new ArrayList<>();
    private ProductsAdapter mUserAdapter;
    private Api api;
    private static int count;
    private ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        api = AppUtils.getRetrofitApi(this);
        count = 0;
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading Items");
        progressDialog.show();
        getProductList(String.valueOf(count),"20");
        mRecyclerView = (RecyclerView) findViewById(R.id.recycleView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mUserAdapter = new ProductsAdapter();
        mRecyclerView.setAdapter(mUserAdapter);
        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(MainActivity.this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if(products.get(position) != null){
                    Intent i = new Intent(MainActivity.this,ProductDetails.class);
                    i.putExtra("desc",products.get(position).getDesc());
                    startActivity(i);

                }
                    //fetchDtailsFromAPI(position);
            }
        }));

        mUserAdapter.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override public void onLoadMore() {
                products.add(null);
                mUserAdapter.notifyItemInserted(products.size() - 1);
                //Load more data for reyclerview
                new Handler().postDelayed(new Runnable() {
                    @Override public void run() {
                        products.remove(products.size() - 1);
                        mUserAdapter.notifyItemRemoved(products.size());
                        count ++;
                        getProductList(String.valueOf(count),"20");
                    }
                }, 2000);
            }
        });
    }

    private void fetchDtailsFromAPI(int position) {

    }

    private void getProductList(String s, String s1) {

        Call<ResponseModel> call = api.getCatalog(s,s1);
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                if(progressDialog != null)
                    progressDialog.dismiss();
                products.addAll(response.body().getProducts());
                mUserAdapter.notifyDataSetChanged();
                mUserAdapter.setLoaded();
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName;
        public TextView tvDesc;
        public ImageView productImage;
        public ProductViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tvName);
            tvDesc = (TextView) itemView.findViewById(R.id.tvDesc);
            productImage = (ImageView)itemView.findViewById(R.id.productImage);
        }
    }
    static class LoadingViewHolder extends RecyclerView.ViewHolder {
        public ProgressBar progressBar;
        public LoadingViewHolder(View itemView) {
            super(itemView);
            progressBar = (ProgressBar) itemView.findViewById(R.id.progressBar1);
        }
    }
    class ProductsAdapter extends RecyclerView.Adapter < RecyclerView.ViewHolder > {

        private final int VIEW_TYPE_ITEM = 0;
        private final int VIEW_TYPE_LOADING = 1;
        private OnLoadMoreListener mOnLoadMoreListener;private boolean isLoading;private int visibleThreshold = 5;
        private int lastVisibleItem, totalItemCount;

        public ProductsAdapter() {
            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mRecyclerView.getLayoutManager();
            mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                    super.onScrolled(recyclerView, dx, dy);
                    totalItemCount = linearLayoutManager.getItemCount();
                    lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();
                    if (!isLoading && totalItemCount <= (lastVisibleItem + visibleThreshold)) {
                        if (mOnLoadMoreListener != null) {
                            mOnLoadMoreListener.onLoadMore();
                        }
                        isLoading = true;
                    }
                }
            });
        }

        public void setOnLoadMoreListener(OnLoadMoreListener mOnLoadMoreListener) {
            this.mOnLoadMoreListener = mOnLoadMoreListener;
        }
        @Override public int getItemViewType(int position) {
            return products.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
        }
        @Override public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            if (viewType == VIEW_TYPE_ITEM) {
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_user_item, parent, false);
                return new ProductViewHolder(view);
            } else if (viewType == VIEW_TYPE_LOADING) {
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_loading_item, parent, false);
                return new LoadingViewHolder(view);
            }
            return null;
        }
        @Override public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            if (holder instanceof ProductViewHolder) {
                Product product = products.get(position);
                ProductViewHolder userViewHolder = (ProductViewHolder) holder;
                userViewHolder.tvName.setText(product.getTitle());
                userViewHolder.tvDesc.setText(product.getDesc());
                Glide.with(getApplicationContext()).load("http://media.redmart.com/newmedia/200p"+product.getImg().getName().toString()).into(userViewHolder.productImage);
            } else if (holder instanceof LoadingViewHolder) {
                LoadingViewHolder loadingViewHolder = (LoadingViewHolder) holder;
                loadingViewHolder.progressBar.setIndeterminate(true);
            }
        }
        @Override public int getItemCount() {
            return products == null ? 0 : products.size();
        }
        public void setLoaded() {
            isLoading = false;
        }
    }

}
