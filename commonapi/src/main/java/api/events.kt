package coreapi

abstract class BaseEvent<T> (
    open val id: T
);
data class CustomerCreatedEvent(
    override val id : String,
    val payload:CustomerDTO
):BaseCommand<String>(id);


data class CustomerEditedEvent(
        override val id : String,
        val payload:EditCustomerDTO
):BaseCommand<String>(id);
