SUMMARY = "A microframework based on Werkzeug, Jinja2 and good intentions"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=79aa8b7bc4f781210d6b5c06d6424cb0"

RDEPENDS_${PN} = "python-itsdangerous python-Werkzeug python-jinja2"

SRC_URI[md5sum] = "378670fe456957eb3c27ddaef60b2b24"
SRC_URI[sha256sum] = "4c83829ff83d408b5e1d4995472265411d2c414112298f2eb4b359d9e4563373"

PR = "r4"

inherit pypi
