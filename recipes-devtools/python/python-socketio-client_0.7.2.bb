SUMMARY = "A socket.io client library."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d254476822e464804f51bea272ee2588"

RDEPENDS_${PN} = " \
  python-websocket-client \
  python-requests \
"

PYPI_PACKAGE = "socketIO-client"

SRC_URI[md5sum] = "ecdbfa4cc00118d2948632cd50b10735"
SRC_URI[sha256sum] = "64cd84fba79cf97f28c11e64d1fc42a2221f2d7a4fada05ab381e2d73d74d2c1"

PR = "r1"

inherit pypi setuptools
