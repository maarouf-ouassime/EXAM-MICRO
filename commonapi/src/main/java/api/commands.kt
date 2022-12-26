package coreapi


import org.axonframework.modelling.command.TargetAggregateIdentifier


abstract class BaseCommand<T>(
    @TargetAggregateIdentifier open val id : T
);
data class CreateNewCustomerCommand(
        override val id : String,
        val payload : CustomerDTO,
) : BaseCommand<String>(id);



data class EditCustomerCommand(
    override val id : String,
    val payload : EditCustomerDTO,
) : BaseCommand<String>(id);





