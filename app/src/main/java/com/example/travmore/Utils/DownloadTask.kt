package com.example.travmore.Utils

import android.os.AsyncTask
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class DownloadTask : AsyncTask<String, Void, String>() {
    override fun doInBackground(vararg p0: String?): String {
        var response : Response? = null
        try {
            val client = OkHttpClient()
            val request = Request.Builder()
                .url("https://travel-places.p.rapidapi.com/")
                .addHeader("X-RapidAPI-Key", "SIGN-UP-FOR-KEY")
                .addHeader("X-RapidAPI-Host", "travel-places.p.rapidapi.com")
                .build()
            response = client.newCall(request).execute()
        }
        catch (e: Exception) {
            e.printStackTrace()
        }
        return response.toString()
    }
}