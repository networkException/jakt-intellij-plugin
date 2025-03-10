package org.serenityos.jakt

import com.intellij.lexer.FlexAdapter
import com.intellij.psi.tree.IElementType
import org.serenityos.jakt.lexer.JaktLexer

class JaktLexerAdapter : FlexAdapter(JaktLexer(null))

class JaktToken(debugName: String) : IElementType(debugName, JaktLanguage) {
    override fun toString() = "JaktToken.${super.toString()}"
}

class JaktElement(debugName: String) : IElementType(debugName, JaktLanguage)
