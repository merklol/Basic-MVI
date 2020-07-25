package mvi

interface ContactsInteractor {
    fun getContacts(): ContactsState
}