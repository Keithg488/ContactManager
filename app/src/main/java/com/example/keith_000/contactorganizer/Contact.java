package com.example.keith_000.contactorganizer;

import android.net.Uri;

import java.util.Arrays;

/**
 * Created by keith_000 on 2/22/2015.
 */
public class Contact  {

    private String _name, _phone, _email, _address, _facebook, _twitter, _insta, _birthday, _nickname, _company;
    private Uri _imageUri;
    private int _id;

    public Contact (int id, String name, String phone, String email, String address, Uri imageUri, String facebook, String twitter, String insta, String birthday, String nickname, String company) {

        _id = id;
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
        _imageUri = imageUri;
        _facebook = facebook;
        _twitter = twitter;
        _insta = insta;
        _birthday = birthday;
        _nickname = nickname;
        _company = company;
    }
    public int getId() { return _id; }

    public String getName() { return _name; }

    public String getPhone() { return _phone; }

    public String getEmail() { return _email; }

    public String getAddress() { return _address; }

    public Uri getImageURI() { return _imageUri; }

    public String getFacebook() { return _facebook; }

    public String getTwitter() { return _twitter; }

    public String getInstagram() { return _insta; }

    public String getBirthday() { return _birthday; }

    public String getNickname() { return _nickname; }

    public String getCompany() { return _company; }


}