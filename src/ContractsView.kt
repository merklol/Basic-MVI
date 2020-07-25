package mvi

class ContractsView : ContactsContract.View {

    fun onViewCreated() {
        val presenter = ContractsPresenter(ContactsInteractorImpl())
        presenter.bind(this)
    }

    override fun render(contactsState: ContactsState) {
        when(contactsState) {
            is ContactsState.DataState -> displayContacts(contactsState.contacts)
            is ContactsState.ErrorState -> displayError(contactsState.message)
        }
    }

    private fun displayContacts(contacts: List<Contact>) {
        for(contact in contacts) {
            println("Name: ${contact.name} Phone: ${contact.phoneNumber}")
        }
    }

    private fun displayError(error: String) {
        println(error)
    }
}