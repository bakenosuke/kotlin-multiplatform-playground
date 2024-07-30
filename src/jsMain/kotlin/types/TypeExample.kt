package types

/**
 * IntelliJ flags non-exportable field types
 */
@JsExport
data class TypeExample(
    val string: String,
    val bool: Boolean,
    val int: Int,
    val float: Float,
    val long: Long,
    val double: Double,
    val map: Map<String, String>,
    val list: List<String>,
    val set: Set<String>
)