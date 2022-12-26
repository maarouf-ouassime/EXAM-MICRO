package coreapi

import java.time.Instant
import java.util.*

data class CustomerDTO(
    var nom : String ="",
    var address : String ="",
    var mail :String ="",
    var tel : String ="",
    );
data class EditCustomerDTO(
        var address : String ="",
        var mail :String ="",
        var tel : String ="",
);



data class CustomerResponseDTO(
    var customerId : String ="",
    var nom : String ="",
    var address : String ="",
    var mail :String ="",
    var tel : String ="",
);


data class EventDataResponseDTO<T>(
    var type : String="",
    var eventData : T ,
);





