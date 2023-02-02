package com.codestation.elazkar.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.codestation.elazkar.R
import com.codestation.elazkar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var appBarConfiguration: AppBarConfiguration


    // create nav controller to use navigation in our main activity
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set action bar and bottom navigation with binding
        val toolBar = binding.toolbar
        val bottomNavigation = binding.bottomNavigation

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.morningAzkarFragment,
                R.id.eveningAzkarFragment,
                R.id.elsabhaFragment
            )
        )

        // create reference from nave host fragment
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        // reassign the navController to nav host because nav host has already nav Controller to control on fragments that will appeared in feature
        navController = navHostFragment.findNavController()


        // set Action bar
        setSupportActionBar(toolBar)

//        supportActionBar?.setDisplayHomeAsUpEnabled(false)
//        supportActionBar?.setHomeButtonEnabled(false)

        //make link between action bar and navController
        setupActionBarWithNavController(navController, appBarConfiguration)


        //set up bottom navigation view
        bottomNavigation.setupWithNavController(navController)



    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }


}