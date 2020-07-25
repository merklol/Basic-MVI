package mvi

class ContractsPresenter(private val contactsInteractor: ContactsInteractorImpl)
    : ContactsContract.Presenter {
    private lateinit var view: ContactsContract.View

    override fun bind(view: ContactsContract.View) {
        this.view = view
        view.render(contactsInteractor.getContacts())
    }
}