class InVar {

  private void post(HttpResponseStatus responseStatus) {

    doSomething();

    extractedMethod(responseStatus);
  }

  private void extractedMethod(HttpResponseStatus responseStatus) {
    if (channel.isOpen()) {
      if (!isKeepAlive) {
         channel.writeAndFlush(LastHttpContent.EMPTY_LAST_CONTENT).addListener(ChannelFutureListener.CLOSE);
      }
    }
  }
}