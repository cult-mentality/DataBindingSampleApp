package com.example.application.two.way

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.application.BR

//extend BaseObservable which is a type of observable which will update data on the go
class Contact(name: String, email: String) : BaseObservable() {
    var name: String = name
        //when we annote a property with bindable it is added in the BR class
        // i.e. a property which can be updated through binding
        @Bindable get() = field
        set(value) {
            field = value

            //after annoting Bindable rebuild the project to get the notifyPropertyChanged method
            //this method will update this property everywhere
            notifyPropertyChanged(BR.name)
        }

    var email: String = email
        @Bindable get() = field
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }
}