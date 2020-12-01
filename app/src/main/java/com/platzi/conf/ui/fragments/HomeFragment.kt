package com.platzi.conf.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.platzi.conf.R
import com.platzi.conf.model.Conf
import com.platzi.conf.ui.adapters.ItemsHomeAdapter

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val rvListHome = view.findViewById(R.id.rvListaHome) as RecyclerView

        val listaItems = arrayListOf(
            Conf(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.banner_platzi_conf,
                    null
                ), resources.getString(R.string.inicio_frag_tv_que_es), resources.getString(R.string.inicio_frag_tv_que_es_resp)
            ),
            Conf(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.platzi_conf_2,
                    null
                ), resources.getString(R.string.inicio_frag_tv_por_que), resources.getString(R.string.inicio_frag_tv_por_que_resp)
            ),
            Conf(
                ResourcesCompat.getDrawable(
                    resources,
                    R.drawable.platzi_conf_3,
                    null
                ), resources.getString(R.string.inicio_frag_tv_info), resources.getString(R.string.inicio_frag_tv_info_resp)
            )
        )

        rvListHome.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = ItemsHomeAdapter(listaItems)
        }
    }
}