package com.geekstudio.sabitalievanuskaiymhm35gr_1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var i = 0
    private var isplus = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPlus.setOnClickListener {
            if (isplus){
                i++
                if (i == 10){
                    binding.btnPlus.text = "-1"
                    isplus = false
                }
            }else{
                i--
                if (i == 0){
                    startActivity(Intent(this, SecondMainActivity::class.java))
                    isplus = true
                    binding.btnPlus.text = "+1"
                }
            }

            binding.textView.text = i.toString()
        }
    }

}