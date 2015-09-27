DESCRIPTION = ""
HOMEPAGE = ""
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13484d110cf0f7e0713493cb09a8601c"
DEPENDS = "python-gevent-websocket"

RDEPENDS_${PN} = "python-gevent-websocket"

SRCNAME = "gevent-socketio"

SRC_URI = "\
          https://pypi.python.org/packages/source/g/gevent-socketio/gevent-socketio-${PV}.tar.gz \
          "
S = "${WORKDIR}/${SRCNAME}-${PV}"

# Package Revision, Update this whenever you change the recipe.
PR = "r1"

inherit setuptools

SRC_URI[md5sum] = "33f745d74885366a07da516c000854b6"
SRC_URI[sha256sum] = "53394ab93fbd84d9dbbb2bef85349f6a503bfc53d86a9be8653250f1a0412aff"
