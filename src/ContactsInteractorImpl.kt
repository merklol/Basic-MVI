package mvi

class ContactsInteractorImpl : ContactsInteractor {

    override fun getContacts(): ContactsState {
        val list = NetworkClient.getContacts()
        return if(list == null) ContactsState.ErrorState("Something went wrong!")
        else ContactsState.DataState(list)
    }
}