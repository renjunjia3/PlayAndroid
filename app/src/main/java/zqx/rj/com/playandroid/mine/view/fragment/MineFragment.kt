package zqx.rj.com.playandroid.mine.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import zqx.rj.com.playandroid.R

/**
 * author：  HyZhan
 * created： 2018/10/13 13:51
 * desc：    TODO
 */
class MineFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_mine, null)
        return view
    }
}