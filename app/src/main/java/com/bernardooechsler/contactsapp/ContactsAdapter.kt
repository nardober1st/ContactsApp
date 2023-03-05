package com.bernardooechsler.contactsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsAdapter(private val contacts: List<Contacts>) :
    RecyclerView.Adapter<ContactsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsListViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.contacts_list, parent, false)
        return ContactsListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    override fun onBindViewHolder(holder: ContactsListViewHolder, position: Int) {
        val contact = contacts[position]
        holder.bind(contact)
    }
}

class ContactsListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val textViewContactName = view.findViewById<TextView>(R.id.text_view_contact_name)
    val textViewContactNumber = view.findViewById<TextView>(R.id.text_view_contact_number)

    fun bind(contacts: Contacts) {

        textViewContactName.text = contacts.name
        textViewContactNumber.text = contacts.number
    }
}