package com.example.logpswrd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.logpswrd.databinding.ActivityMainBinding
import com.example.logpswrd.Human


class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        bind.btn.setOnClickListener {
            val loginUser = bind.login.text.toString()
            val passwordUser = bind.password.text.toString()
            when (loginUser) {
                Human.DIRECTOR -> {
                    if (passwordUser == Human.DIRECTOR_PASSWORD) {
                        bind.salary.text = "Выдано ${Human.DIRECTOR_SALARY}"
                    } else {
                        bind.salary.text = "Неверный пароль для сотудника ${Human.DIRECTOR}"
                    }
                }

                Human.HR -> {
                    if (passwordUser == Human.HR_PASSWORD) {
                        bind.salary.text = "Выдано ${Human.HR_SALARY}"
                    } else {
                        bind.salary.text = "Неверный пароль для сотудника ${Human.HR}"
                    }
                }

                Human.BUHGALTER -> {
                    if (passwordUser == Human.BUHGALTER_PASSWORD) {
                        bind.salary.text = "Выдано ${Human.BUHGALTER_SALARY}"
                    } else {
                        bind.salary.text = "Неверный пароль для сотудника ${Human.BUHGALTER}"
                    }
                }

                else -> bind.salary.text = "Неверный логин для сотудника"
            }
        }

    }


}