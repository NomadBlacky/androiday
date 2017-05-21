package com.slack.sango_study.androiday.ui

import android.view.View
import com.slack.sango_study.androiday.AnkoSampleActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

/**
 * Created by blacky on 17/05/21.
 */
class AnkoSampleActivityUi : AnkoComponent<AnkoSampleActivity> {
    override fun createView(ui: AnkoContext<AnkoSampleActivity>): View = with(ui) {
        verticalLayout {
            textView {
                text = "Hello, Anko!"
            }
        }
    }
}