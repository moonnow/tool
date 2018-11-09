package com.pro.tool.util;

import com.pro.tool.vo.TokenTimesEffect;

public final class ToolContextData {

  private static final ThreadLocal<TokenTimesEffect> tokenTimesEffectThreadLocal = new ThreadLocal<>();

  public static final TokenTimesEffect getTokenTimesEffect() {
    return (TokenTimesEffect) tokenTimesEffectThreadLocal.get();
  }

  public static final void setTokenTimesEffect(TokenTimesEffect tokenTimesEffect) {
    tokenTimesEffectThreadLocal.set(tokenTimesEffect);
  }

  public static final void removeTokenTimesEffect() {
    tokenTimesEffectThreadLocal.remove();
  }

}
