package com.mgenware.cjxlku

/**
 * CjxlKu is a Kotlin wrapper for the native cjxl CLI.
 */
class CjxlKu {
    private external fun cjxlmain(argv: Array<String>): Int

    companion object {
        init {
            System.loadLibrary("cjxlx")

            // Load this lib last.
            System.loadLibrary("cjxlku")
        }
    }

    /**
     * Runs the cjxl CLI with the provided arguments.
     *
     * @param argv The command line arguments to pass to cjxl.
     * @return The exit code from the cjxl CLI.
     */
    fun run(argv: Array<String>): Int {
        val newArgv = arrayOf("cjxl") + argv
        return cjxlmain(newArgv)
    }
}