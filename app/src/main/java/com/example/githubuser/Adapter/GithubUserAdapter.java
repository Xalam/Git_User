package com.example.githubuser.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.githubuser.DetailActivity;
import com.example.githubuser.GithubUser;
import com.example.githubuser.R;

import java.util.ArrayList;

public class GithubUserAdapter extends RecyclerView.Adapter<GithubUserAdapter.ListViewHolder> {
    private ArrayList<GithubUser> listGithubUser;

    public GithubUserAdapter(ArrayList<GithubUser> list) {
        this.listGithubUser = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_github, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final GithubUser githubUser = listGithubUser.get(position);
        Glide.with(holder.itemView.getContext())
                .load(githubUser.getAvatar())
                .apply(new RequestOptions().override(60, 60))
                .into(holder.avatarGithub);
        holder.tvFullName.setText(githubUser.getFullName());
        holder.tvUsername.setText(githubUser.getUserName());
        holder.tvCompany.setText(githubUser.getCompany());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_GITHUB, githubUser);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listGithubUser.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView avatarGithub;
        TextView tvFullName, tvUsername, tvCompany;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            avatarGithub = itemView.findViewById(R.id.ci_avatar);
            tvFullName = itemView.findViewById(R.id.tv_fullname);
            tvUsername = itemView.findViewById(R.id.tv_username);
            tvCompany = itemView.findViewById(R.id.tv_company);
        }
    }
}
