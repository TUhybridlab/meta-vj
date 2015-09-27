SUMMARY = "A coroutine-based Python networking library"
DESCRIPTION = "gevent is a coroutine-based Python networking library that uses greenlet to provide \
a high-level synchronous API on top of the libevent event loop."
HOMEPAGE = "http://www.gevent.org"
SECTION = "devel/python"
LICENSE = "MIT & BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2dbb33d00e1fd31c7041460a81ac0bd2"
DEPENDS += "python-greenlet python-pip"
RDEPENDS_${PN} += "python-greenlet python-mime python-pprint python-re"

SRC_URI = "http://pypi.python.org/packages/source/g/gevent/gevent-${PV}.tar.gz"
SRC_URI[md5sum] = "117f135d57ca7416203fba3720bf71c1"
SRC_URI[sha256sum] = "3ae1ca0f533ddcb17aab16ce66b424b3f3b855ff3b9508526915d3c6b73fba31"

S = "${WORKDIR}/gevent-${PV}"

# Package Revision, Update this whenever you change the recipe.
PR = "r6"

inherit setuptools

do_configure_append () {
  cd libev
  ./configure --host=${HOST_ARCH}
  cd ..
}
