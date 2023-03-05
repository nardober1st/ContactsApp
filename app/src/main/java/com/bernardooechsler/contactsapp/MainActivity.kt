package com.bernardooechsler.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        val contact1 = Contacts("Bernardo", "+1(111) 111-1111")
        val contact2 = Contacts("Jay", "+1(222) 222-2222")
        val contact3 = Contacts("Ana Julia", "+1(333) 333-3333")
        val contact4 = Contacts("Jhonny", "+1(444) 444-4444")
        val contact5 = Contacts("Brad", "+1(555) 555-5555")
        val contact6 = Contacts("Roque", "+1(666) 666-6666")
        val contact7 = Contacts("Lagertha", "+1(777) 777-7777")

        val list =
            listOf(contact1, contact2, contact3, contact4, contact5, contact6, contact7)

        val contactsList: RecyclerView = findViewById(R.id.recycler_view_contact_list)

        contactsList.adapter = ContactsAdapter(list)
    }
}