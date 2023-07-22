class InVar {

  private void post(HttpResponseStatus responseStatus) {

    doSomething();
    
    if (channel.isOpen()) {
      ChannelFuture lastContentFuture = channel.writeAndFlush(LastHttpContent.EMPTY_LAST_CONTENT);
      if (!isKeepAlive) {
        lastContentFuture.addListener(ChannelFutureListener.CLOSE);
      }
    }
  }
}