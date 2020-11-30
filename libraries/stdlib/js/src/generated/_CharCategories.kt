/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package kotlin.text

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateUnicodeData.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

// 1345 ranges totally
private object Category {
    // rangeLength.length = 1480
    internal const val rangeLength = "gBDEEDDJDDDYDDaDDfDDEDDDDDEDXDFYDG4BRwBGDFEEDGDIEEEEFDDDDKPTFD8BGGEDJkCDZSEMOFHEQwDEDDDDEDDFEPDHjBEDEWEFDDxBwBiBDDD2BOhDDkBDGpBDDDsBDHIbEEDKGDFDKEDeDIVKEFhDDGDFDEDDIDDODDcbD4CLDMKhBJDDDDWEDHDEDDODXDEL1BVDQLPDeD0BDDDGEDDFKDDIDODDGDEVDFEDDDDEDEDIDDEDDJDDEDDDDFEDDUDFKDDDDDDDEFEEFKDDDIDDHDEUDFGDDDDDDEDDNDDKDGDEDDHDEVDFGDDDDDEDDFDEFDDJDFKDGDDDDDFDEDDDLEFDDDDEEDMKDGDEDDHDEVDODDDDDDDGDDFDDKHDFDDIDEVDIDDDDFDEDGDGEDDIEMDDHDEnBDDEDEDDDDHDDDIJDEDDRDYDHFGDDDDEDGGKDDLwBEGEDEDGDIDkBEDDDWEJEIEEDGDJDDgBDDNEEFKKGEDHDiBEODDDFLDiBDGDEDFEDkBrBDDDEEDDIGGDDDDDDGDENEDEDKDDmBEDDrBDDoKDDDFEDDoBDDDfDDDFEDDOD3BDDDhCDDIUDQKG2CDFDsTDQDYDDqCDDIHNDDDKSDDISDLNDDDK0BFFIEKDDDDKGKGGDDDDIGjBDzBHFDhBDEmCKfDDDDDDEEDEDDKeDELsBEaGKDDgBXDDD1BEGDEHGKDKGKGHDEDND/BEDtBEDEDDHEKHKJJDDeDDGDKsBFEDDHEkBIIDDDDKDDKeGDIHrBDDHIDDLDFEDEDDDDsB/BNDgBlB6BDD2EIiDIIGDFDHIIIGDFDHIIIODHIIIIIFDEDDDDEDDDDEDDGFDDFEDDJFGDDEIDEDHDDDDDKDKDDDIDDEDDKDDNDgBQNEDDKPFFDEDEDDGHDDDDDDDFDDDDPjBDDDEFFDDJFDdDFesIIEUDGDwCDcZoBGlCZLV8BuCW3FDHD0BIvDD2HOesBFDeKQgIjEW/BEgBDhIwBVDFnBDfDnDvBDtBDDEFDHEDEhDDEEDDEEDmBEDD4BHDNDVJHDFDFDFDFDFDFDFDeDDDGIFDDIFDIDDDNDtBaD3CM2GaMEDDDJDHDDIEDFDDDD1CDDDD4CDDErBD8CDEKgBkBMQfDIeIDNgBKnBPgKguGgC9vUDVD1jBD3BJoBGDrIDDOKDTuBDDKDbDDkCKDFIXJDNE8BDGFKDEDDWEDDLDDEDoBDDHDEFVDDDDDEEG0BEIDxBQDHDJGSGDEDIcIDWLDKDbDDDtBEDDDDLDJEDEDIKFDnBGDEDHDDGDDIDDQDEDDDwBEEDDEDWDDKEDDDJGDFDFJHDFDpBDDIDEwCjBIDDJGk9KMXExBEgcgEggBgoGuLDpDmBHMFFEIDLDDEHqDQRrLDPgCD1BoBMDDOHDGQDDPDDDDFDGDEDDEFDlEEDDEDDJDDDYDDaDDEDIDrBDeDGDFDFDDDDDDDDJDD"

    // rangeCategory.length = 2646
    internal const val rangeCategory = "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"

    internal val decodedRangeStart: IntArray
    internal val decodedRangeCategory: IntArray
    
    init {
        val toBase64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
        val fromBase64 = IntArray(128)
        for (i in toBase64.indices) {
            fromBase64[toBase64[i].toInt()] = i
        }
        val length = decodeVarLenBase64(rangeLength, fromBase64, 1344)
        val start = IntArray(length.size + 1)
        for (i in length.indices) {
            start[i + 1] = start[i] + length[i]
        }
        decodedRangeStart = start
        decodedRangeCategory = decodeVarLenBase64(rangeCategory, fromBase64, 1345)
    }
}

private fun categoryValueFrom(code: Int, ch: Int): Int {
    return when {
        code < 0x20 -> code
        code < 0x400 -> if ((ch and 1) == 1) code shr 5 else code and 0x1f
        else ->
            when (ch % 3) {
                2 -> code shr 10
                1 -> (code shr 5) and 0x1f
                else -> code and 0x1f
            }
    }
}

/**
 * Returns the Unicode general category of this character as an Int.
 */
internal fun Char.getCategoryValue(): Int {
    val ch = this.toInt()

    val index = binarySearchRange(Category.decodedRangeStart, ch)
    val code = Category.decodedRangeCategory[index]
    val value = categoryValueFrom(code, ch)

    return if (value == 17) CharCategory.UNASSIGNED.value else value
}

internal fun decodeVarLenBase64(base64: String, fromBase64: IntArray, resultLength: Int): IntArray {
    val result = IntArray(resultLength)
    var index = 0
    var int = 0
    var shift = 0
    for (char in base64) {
        val sixBit = fromBase64[char.toInt()]
        int = int or ((sixBit and 0x1f) shl shift)
        if (sixBit < 0x20) {
            result[index++] = int
            int = 0
            shift = 0
        } else {
            shift += 5
        }
    }
    return result
}
