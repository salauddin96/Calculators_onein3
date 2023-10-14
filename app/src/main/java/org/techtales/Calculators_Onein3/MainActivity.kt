package org.techtales.Calculators_Onein3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import org.techtales.Calculators_Onein3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navController = findNavController(R.id.fragmentContainerView)
        binding.bottombar.setupWithNavController(navController)


        actionBarDrawerToggle = ActionBarDrawerToggle(this,binding.drawerlayout, R.string.nav_open, R.string.nav_close)
        actionBarDrawerToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.drawerNav.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.bmiFragment ->{
                    binding.drawerlayout.closeDrawers()
                    binding.drawerNav.setupWithNavController(navController)
                }

                R.id.scientificFragment ->{
                    binding.drawerlayout.closeDrawers()
                    binding.drawerNav.setupWithNavController(navController)
                }
                R.id.tempFragment ->{
                    binding.drawerlayout.closeDrawers()
                    binding.drawerNav.setupWithNavController(navController)
                }
                R.id.setting ->{
                    binding.drawerlayout.closeDrawers()
                    Toast.makeText(this@MainActivity, "Clicked settings", Toast.LENGTH_SHORT).show()
                }
                R.id.logout ->{
                    binding.drawerlayout.closeDrawers()
                    Toast.makeText(this@MainActivity, "Clicked Logout", Toast.LENGTH_SHORT).show()
                }
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            true
        }else super.onOptionsItemSelected(item)
    }

}
