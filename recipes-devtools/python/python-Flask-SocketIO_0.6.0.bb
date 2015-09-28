SUMMARY = "Socket.IO integration for Flask applications"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=e1e599768cbb57e0d0489a40b8835b3d"

RDEPENDS_${PN} = "python-Flask python-gevent python-gevent-socketio python-numbers python-netserver"

SRC_URI[md5sum] = "a990a0f63502f74be0d893cf142db7bf"
SRC_URI[sha256sum] = "5b004bc9a74421ec3983f5167a7cab70853b132a9c9c09d808c07f96bbf6ecd9"

PR = "r3"

inherit pypi
