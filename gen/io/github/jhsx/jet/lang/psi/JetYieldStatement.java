// This is a generated file. Not intended for manual editing.
package io.github.jhsx.jet.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface JetYieldStatement extends JetStatement {

  @Nullable
  JetEndStatement getEndStatement();

  @Nullable
  JetIdentifierExpr getIdentifierExpr();

  @Nullable
  JetPipeline getPipeline();

  @Nullable
  JetStatementList getStatementList();

  @Nullable
  JetYieldParameterList getYieldParameterList();

}
