package com.example.watermyplants_xml.presentation.home_plant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.watermyplants_xml.R
import com.example.watermyplants_xml.databinding.FragmentHomeBinding
import com.example.watermyplants_xml.presentation.home_plant.history.HistoryFragment
import com.example.watermyplants_xml.presentation.home_plant.upcoming.UpcomingFragment
import com.google.android.material.tabs.TabLayoutMediator


class HomeFragment : Fragment() {
    private val binding: FragmentHomeBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Configura el ViewPager2 con el adaptador
        val pagerAdapter = PagerAdapter(this)
        binding.viewPager.adapter = pagerAdapter

        // Configura TabLayout con ViewPager2
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Upcoming"
                1 -> "History"
                else -> throw IllegalArgumentException("Invalid position")
            }
        }.attach()
    }
}

class PagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> UpcomingFragment()
            1 -> HistoryFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}