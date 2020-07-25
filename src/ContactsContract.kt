package mvi

interface ContactsContract {
    interface Presenter {
        fun bind(view: View)
    }

    interface View {
        fun render(contactsState: ContactsState)
    }
}