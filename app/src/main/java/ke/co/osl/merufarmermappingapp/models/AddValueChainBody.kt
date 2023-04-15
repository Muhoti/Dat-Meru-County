package ke.co.osl.merufarmermappingapp.models

data class AddValueChainBody(
    val FarmerID: String,
    val Name: String,
    val Variety: String,
    val Unit: String,
    val ApproxAcreage: String,
    val AvgYearlyProduction: String,
    val AvgHarvestProduction: String
    )