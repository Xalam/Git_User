package com.example.githubuser;

import android.os.Parcel;
import android.os.Parcelable;

public class GithubUser implements Parcelable {
    public static final Creator<GithubUser> CREATOR = new Creator<GithubUser>() {
        @Override
        public GithubUser createFromParcel(Parcel in) {
            return new GithubUser(in);
        }

        @Override
        public GithubUser[] newArray(int size) {
            return new GithubUser[size];
        }
    };
    private String userName;
    private String fullName;
    private String location;
    private int repository;
    private String company;
    private int followers;
    private int following;
    private int avatar;

    public GithubUser() {

    }

    protected GithubUser(Parcel in) {
        userName = in.readString();
        fullName = in.readString();
        location = in.readString();
        repository = in.readInt();
        company = in.readString();
        followers = in.readInt();
        following = in.readInt();
        avatar = in.readInt();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRepository() {
        return repository;
    }

    public void setRepository(int repository) {
        this.repository = repository;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(userName);
        parcel.writeString(fullName);
        parcel.writeString(location);
        parcel.writeInt(repository);
        parcel.writeString(company);
        parcel.writeInt(followers);
        parcel.writeInt(following);
        parcel.writeInt(avatar);
    }
}
