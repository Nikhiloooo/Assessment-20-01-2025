package com.example.exam

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
 import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.selectedItemId = R.id.recycler_view


        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_recycler -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, RecyclerViewFragment())
                        .commit()
                }

                R.id.nav_viewpager -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, ViewPagerFragment())
                        .commit()
                }

                }

            true
        }

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,RecyclerViewFragment())
            .commit()

    }
}