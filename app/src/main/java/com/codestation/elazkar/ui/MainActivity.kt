package com.codestation.elazkar.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.codestation.elazkar.R
import com.codestation.elazkar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration


    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavigation = binding.bottomNavigation

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.morningAzkarFragment,
                R.id.eveningAzkarFragment,
                R.id.elsabhaFragment
            )
        )

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
        navController = navHostFragment!!.findNavController()


        bottomNavigation.setupWithNavController(navController)


    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }


}