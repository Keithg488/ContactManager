package com.example.keith_000.contactorganizer;

import android.net.Uri;

/**
 * Created by keith_000 on 2/22/2015.
 */
public class Contact  {

    private String _name, _phone, _email, _address;
    private Uri _imageUri;
    private int _id;

    public Contact (int id, String name, String phone, String email, String address, Uri imageUri) {

_id = id;
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
        _imageUri = imageUri;
    }
    public int getId() { return _id; }

    public String getName() { return _name; }

    public String getPhone() { return _phone; }

    public String getEmail() { return _email; }

    public String getAddress() { return _address; }

    public Uri getImageUri() { return _imageUri; }
}