package com.slack.sango_study.androiday

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.dd.realmbrowser.RealmBrowser
import io.realm.Realm


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Realm.init(this)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.activity_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.callRealmModelsActivity -> showRealmModelsActivity(this)
        }
        return super.onOptionsItemSelected(item)
    }
}
}

fun showRealmModelsActivity(activity: Activity) {
    val realm = Realm.getDefaultInstance()
    val realmConf = realm.configuration
    RealmBrowser.getInstance().addRealmConf(realmConf)
    RealmBrowser.startRealmModelsActivity(activity, realmConf)
}
