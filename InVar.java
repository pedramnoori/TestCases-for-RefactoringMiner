class InVar {

  private void post(HttpResponseStatus responseStatus) {

    doSomething();

    extractedMethod(responseStatus);
  }

  private void extractedMethod(HttpResponseStatus responseStatus) {
    if (channel.isOpen()) {
      if (!isKeepAlive) {a
         channel.writeAndFlush(LastHttpContent.EMPTY_LAST_CONTENT).addListener(ChannelFutureListener.CLOSE);
      }
    }
  }
}