package org.spectral.asm

/**
 * Represents a local variable or argument of a [Method]
 * object.
 */
class Variable(
    val group: ClassGroup,
    val owner: Method,
    val isArg: Boolean,
    val index: Int,
    val lvIndex: Int,
    val asmIndex: Int,
    val typeClass: Class,
    val startInsn: Int,
    val endInsn: Int,
    val startOpIndex: Int,
    override val name: String
) : Matchable<Variable>() {

}