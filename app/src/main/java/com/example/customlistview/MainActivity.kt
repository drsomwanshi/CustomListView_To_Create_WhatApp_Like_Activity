package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name= arrayOf("ram","sumit","Amit","Balaji")
        var contact= arrayOf("6867876","67867876","686876","978987")
        var img= arrayOf(R.drawable.account,R.drawable.account,R.drawable.account,R.drawable.account)

        var adp=MyAdapter(this,name,contact,img);
        var lst=findViewById(R.id.lst1) as ListView
        lst.adapter=adp;

    }
}