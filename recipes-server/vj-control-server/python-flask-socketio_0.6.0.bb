DESCRIPTION = "Socket.IO integration for Flask applications"
HOMEPAGE = "https://github.com/miguelgrinberg/Flask-SocketIO"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=e1e599768cbb57e0d0489a40b8835b3d"
DEPENDS = "python-flask \
           python-gevent-socketio \
          "

RDEPENDS_${PN} = "python-flask \
                  python-gevent-socketio \
                 "

SRCNAME = "Flask-SocketIO"

SRC_URI = "https://pypi.python.org/packages/source/F/Flask-SocketIO/Flask-SocketIO-${PV}.tar.gz"
SRC_URI[md5sum] = "a990a0f63502f74be0d893cf142db7bf"
SRC_URI[sha256sum] = "5b004bc9a74421ec3983f5167a7cab70853b132a9c9c09d808c07f96bbf6ecd9"

S = "${WORKDIR}/${SRCNAME}-${PV}"

# Package Revision, Update this whenever you change the recipe.
PR = "r1"

inherit setuptools
