MVVM-Recyclerview-Binding-Dynamic-Edittext-Using-Room-Object
===================================

This sample showcases the following Architecture Components:

* [Room](https://developer.android.com/topic/libraries/architecture/room.html)
* [ViewModels](https://developer.android.com/reference/android/arch/lifecycle/ViewModel.html)
* [LiveData](https://developer.android.com/reference/android/arch/lifecycle/LiveData.html)

## Features

This sample contains two screens: a list of products and a detail view, that shows product reviews.

### Presentation layer

The presentation layer consists of the following components:
 * A main activity that handles navigation.
* A fragment to display the list of products.
* A fragment to display a product review.

The app uses a Model-View-ViewModel (MVVM) architecture for the presentation layer. Each of the fragments corresponds to a MVVM View. The View and ViewModel communicate  using LiveData and the following design principles:

* ViewModel objects don't have references to activities, fragments, or Android views. That would cause leaks on configuration changes, such as a screen rotation, because the system retains a ViewModel across the entire lifecycle of the corresponding view.



![ViewModel Diagram](docs/images/VM_diagram.png?raw=true "ViewModel Diagram")

![ViewModel Subscriptions diagram](docs/images/VM_subscriptions.png?raw=true "ViewModel Subscriptions diagram")


