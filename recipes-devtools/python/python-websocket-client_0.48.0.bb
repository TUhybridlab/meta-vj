SUMMARY = "websocket-client module is WebSocket client for python."
LICENSE = "LGPL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4999ff812affd4e43e9848e8bfc732cb"

RDEPENDS_${PN} = " \
  python-six \
"

PYPI_PACKAGE = "websocket_client"

SRC_URI[md5sum] = "a93c5992ce7ecee8fa97a318ef604923"
SRC_URI[sha256sum] = "18f1170e6a1b5463986739d9fd45c4308b0d025c1b2f9b88788d8f69e8a5eb4a"

PR = "r0"

inherit pypi setuptools
