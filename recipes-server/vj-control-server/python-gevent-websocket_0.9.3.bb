DESCRIPTION = ""
HOMEPAGE = ""
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9b6d0dda2588c549e606f5b0acadeb1b"
DEPENDS = "python-gevent"

RDEPENDS_${PN} = "python-gevent"

SRCNAME = "gevent-websocket"

SRC_URI = "https://pypi.python.org/packages/source/g/gevent-websocket/gevent-websocket-${PV}.tar.gz"
S = "${WORKDIR}/${SRCNAME}-${PV}"

# Package Revision, Update this whenever you change the recipe.
PR = "r2"

inherit setuptools

SRC_URI[md5sum] = "eb59f931d60e068e95adecefaed54df7"
SRC_URI[sha256sum] = "6475220340f9f8895a0f51bd2b9df3511bc7765dc055f49e997584bdaee3381f"
