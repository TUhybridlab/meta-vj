SUMMARY = "Websocket handler for the gevent pywsgi server"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9b6d0dda2588c549e606f5b0acadeb1b"

RDEPENDS_${PN} += "python-gevent \
"

SRC_URI[md5sum] = "03a8473b9a61426b0ef6094319141389"
SRC_URI[sha256sum] = "0091d6e6aa7298510cadcccb8068e1097a50d4e19090d0c055a93068d4530056"

PR = "r4"

inherit pypi setuptools
