package com.slack.sango_study.androiday

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.slack.sango_study.androiday.ui.AnkoSampleActivityUi
import org.jetbrains.anko.setContentView

/**
 * An example that using Anko.
 */
class AnkoSampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoSampleActivityUi().setContentView(this)
    }
}
