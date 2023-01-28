package com.codestation.elazkar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.widget.Toolbar
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.codestation.elazkar.R
import com.codestation.elazkar.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // create nav controller to use navigation in our main activity
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set action bar and bottom navigation with binding
        val toolBar = binding.toolbar
        val bottomNavigation = binding.bottomNavigation



        // create reference from nave host fragment
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        // reassign the navController to nav host because nav host has already nav Controller to control on fragments that will appeared in feature
        navController = navHostFragment.findNavController()

        // set Action bar
        setSupportActionBar(toolBar)

        //set up bottom navigation view
        bottomNavigation.setupWithNavController(navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return super.onSupportNavigateUp()
    }

//    /**
//     * function to increase counter  */
//    private fun increase() {
//        counter++
//        tvCounter.text = counter.toString()
//        btnCounter.text = counter.toString()
//    }
//


}