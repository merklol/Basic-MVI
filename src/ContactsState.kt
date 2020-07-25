package mvi

sealed class ContactsState {
    data class DataState(val contacts: List<Contact>): ContactsState()
    data class ErrorState(val message: String): ContactsState()
}