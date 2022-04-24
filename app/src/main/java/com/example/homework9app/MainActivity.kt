package com.example.homework9app

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import com.example.homework9app.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val images = Images()
    var iterator = 0
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        GlobalScope.launch(Dispatchers.IO) {
            val imageUrl = URL(images.iOne)
            val httpConnection = imageUrl.openConnection() as HttpURLConnection
            httpConnection.doInput = true
            httpConnection.connect()

            val inputStream = httpConnection.inputStream
            val bitmapImage = BitmapFactory.decodeStream(inputStream)
            launch(Dispatchers.Main) {
                Log.d("Homework9", "Current image is ${images.dOne}")
                binding.myIV.setImageBitmap(bitmapImage)
                binding.tvDescription.text = images.dOne
            }
        }

        binding.tvDescription.setOnClickListener {
            when (iterator) {
                0 -> {
                    iterator++
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        val imageUrl = URL(images.iTwo)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dTwo}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dTwo
                        }
                    }
                }
                1 -> {
                    iterator++
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        val imageUrl = URL(images.iThree)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dThree}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dThree
                        }
                    }
                }
                2 -> {
                    iterator = 0
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        delay(2000L)
                        val imageUrl = URL(images.iFour)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dFour}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dFour
                        }
                    }
                }
                3 -> {
                    iterator = 0
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        delay(2000L)
                        val imageUrl = URL(images.iFive)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dFive}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dFive
                        }
                    }


                }
                4 -> {
                    iterator = 0
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        delay(2000L)
                        val imageUrl = URL(images.iSix)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dSix}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dSix
                        }
                    }


                }
                5 -> {
                    iterator = 0
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        delay(2000L)
                        val imageUrl = URL(images.iSeven)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dSeven}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dSeven
                        }
                    }


                }
                6 -> {
                    iterator = 0
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        delay(2000L)
                        val imageUrl = URL(images.iEight)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dEight}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dEight
                        }
                    }


                }
                7 -> {
                    iterator = 0
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        delay(2000L)
                        val imageUrl = URL(images.iNine)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dNine}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dNine
                        }
                    }


                }
                8 -> {
                    iterator = 0
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        delay(2000L)
                        val imageUrl = URL(images.iTen)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dTen}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dTen
                        }
                    }


                }
                9 -> {
                    iterator = 0
                    val job = GlobalScope.launch(Dispatchers.IO) {
                        delay(2000L)
                        val imageUrl = URL(images.iOne)
                        val httpConnection = imageUrl.openConnection() as HttpURLConnection
                        httpConnection.doInput = true
                        httpConnection.connect()

                        val inputStream = httpConnection.inputStream
                        val bitmapImage = BitmapFactory.decodeStream(inputStream)
                        launch(Dispatchers.Main) {
                            Log.d("Homework9", "Current image is ${images.dOne}")
                            binding.myIV.setImageBitmap(bitmapImage)
                            binding.tvDescription.text = images.dOne
                        }
                    }


                }
            }
        }
    }
}